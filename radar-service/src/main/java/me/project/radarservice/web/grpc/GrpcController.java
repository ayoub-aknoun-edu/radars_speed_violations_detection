package me.project.radarservice.web.grpc;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import me.project.radarservice.clients.ImmatriculationServiceFeignClient;
import me.project.radarservice.clients.InfractionServiceFeignClient;
import me.project.radarservice.entities.Radar;
import me.project.radarservice.model.Infraction;
import me.project.radarservice.model.Proprietaire;
import me.project.radarservice.model.Vehicule;
import me.project.radarservice.repositories.RadarRepository;
import me.project.radarservice.web.grpc.stubs.DeppassementVitasseServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;
import me.project.radarservice.web.grpc.stubs.DeppassementVitasseServiceGrpc.DeppassementVitasseServiceImplBase;
import me.project.radarservice.web.grpc.stubs.DepassementVitasse;

import java.util.Date;
import java.util.List;

@GrpcService @AllArgsConstructor
public class GrpcController extends DeppassementVitasseServiceImplBase {
    private RadarRepository radarRepository;
    private ImmatriculationServiceFeignClient immatriculationServiceFeignClient;
    private InfractionServiceFeignClient infractionServiceFeignClient;

    @Override
    public void depasseVitsse(DepassementVitasse.DeppassementRequest request, StreamObserver<DepassementVitasse.deppassementResponse> responseObserver) {
        Radar radar = radarRepository.findById(Long.parseLong(request.getNumeroRadar())).get();
        Vehicule vehicule = immatriculationServiceFeignClient.getVehiculeByMatricule(request.getVehiculeMatricule());
        Proprietaire proprietaire = vehicule.getProprietaire();
        Infraction infraction = new Infraction();
        infraction.setId(null);
        infraction.setDate(new Date());
        infraction.setNumeroRadar(radar.getNumeroRadar());
        infraction.setMatriculeVehicule(request.getVehiculeMatricule());
        infraction.setVitesseVehicule(Double.parseDouble(request.getVitesseVehicule()));
        infraction.setVitesseMaximaleRadar(radar.getVitesseMaximale());
        infraction.setMontantInfraction(300.0);
        infraction = infractionServiceFeignClient.createInfraction(infraction);
        System.out.println(infraction);
        DepassementVitasse.deppassementResponse.Builder builder = DepassementVitasse.deppassementResponse.newBuilder();
        builder.setId(infraction.getId().toString())
                .setDate(infraction.getDate().toString())
                .setNumeroRadar(infraction.getNumeroRadar().toString())
                .setMatriculeVehicule(infraction.getMatriculeVehicule())
                .setVitesseVehicule(infraction.getVitesseVehicule().toString())
                .setVitesseMaximaleRadar(infraction.getVitesseMaximaleRadar().toString())
                .setMontantInfraction(infraction.getMontantInfraction().toString());
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
      //  responseObserver.onError(new Exception("Error in depasseVitsse"));
    }

    @Override
    public void getRadars(Empty request, StreamObserver<DepassementVitasse.RadarResponse> responseObserver) {
        List<Radar> radars = radarRepository.findAll();
        for (Radar radar : radars) {
            DepassementVitasse.RadarResponse.Builder builder = DepassementVitasse.RadarResponse.newBuilder();
            builder.setNumeroRadar(radar.getNumeroRadar().toString())
                    .setVitesseMaximale(String.valueOf(radar.getVitesseMaximale()))
                    .setLongitude(String.valueOf(radar.getLongitude()))
                    .setLatitude(String.valueOf(radar.getLatitude()));
            responseObserver.onNext(builder.build());
        }
        responseObserver.onCompleted();

    }
}
