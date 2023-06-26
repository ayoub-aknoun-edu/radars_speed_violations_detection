package me.project.immatriculationservice.web.grpc;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import me.project.immatriculationservice.entities.Proprietaire;
import me.project.immatriculationservice.entities.Vehicule;
import me.project.immatriculationservice.repositories.ProprietaireRepository;
import me.project.immatriculationservice.repositories.VehiculeRepository;
import me.project.immatriculationservice.stubs.Immatriculation;
import me.project.immatriculationservice.stubs.ImmatriculationServiceGrpc.ImmatriculationServiceImplBase;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;

@Slf4j
@GrpcService
public class ImatGrpcController extends ImmatriculationServiceImplBase{
    ProprietaireRepository proprietaireRepository;
    VehiculeRepository vehiculeRepository;

    public ImatGrpcController(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository) {
        this.proprietaireRepository = proprietaireRepository;
        this.vehiculeRepository = vehiculeRepository;
    }


    @Override
    public void getProprietaire(Immatriculation.PropreitaireRequest request, StreamObserver<Immatriculation.ProprietaireResponse> responseObserver) {
        Long id = Long.parseLong(request.getId());
        Proprietaire p = proprietaireRepository.findById(id).get();
        Immatriculation.ProprietaireResponse.Builder builder = Immatriculation.ProprietaireResponse.newBuilder();
        Immatriculation.ProprietaireResponse pr = builder.setId(p.getId().toString())
                .setNom(p.getName())
                .setDateNaissance(p.getDateNaissance().toString())
                .setEmail(p.getEmail())
                .build();
        responseObserver.onNext(pr);
        responseObserver.onCompleted();
        responseObserver.onError(new Exception("Error here !"));
    }

    @Override
    public void getVehicule(Immatriculation.VehiculeRequest request, StreamObserver<Immatriculation.VehiculeResponse> responseObserver) {
        String mat = request.getMatricule();
        Vehicule v = vehiculeRepository.findByMatricule(mat);
        Immatriculation.VehiculeResponse.Builder builder = Immatriculation.VehiculeResponse.newBuilder();

        Proprietaire p = v.getProprietaire();
        Immatriculation.ProprietaireResponse.Builder propreitairebuilder = Immatriculation.ProprietaireResponse.newBuilder();
        Immatriculation.ProprietaireResponse pr = propreitairebuilder
                .setId(p.getId().toString())
                .setNom(p.getName())
                .setDateNaissance(p.getDateNaissance().toString())
                .setEmail(p.getEmail())
                .build();

        Immatriculation.VehiculeResponse vehicule = builder.
                setMatricule(v.getMatricule())
                .setMarque(v.getMarque())
                .setModele(v.getModele())
                .setPuissance(v.getPuissanceFiscale())
                .setProprietaireId(v.getProprietaireID().toString())
                .setProprietaire(pr)
                .build();
        responseObserver.onNext(vehicule);
        responseObserver.onCompleted();
        responseObserver.onError(new Exception("Error here !"));

    }

    @Override
    public void getVehicules(Immatriculation.PropreitaireRequest request, StreamObserver<Immatriculation.VehiculeResponse> responseObserver) {
        Proprietaire p = proprietaireRepository.findById(Long.parseLong(request.getId())).get();
        Immatriculation.ProprietaireResponse.Builder propreitairebuilder = Immatriculation.ProprietaireResponse.newBuilder();
        List<Vehicule> vehicules = vehiculeRepository.findByProprietaire(p);
        Immatriculation.ProprietaireResponse pr = propreitairebuilder
                .setId(p.getId().toString())
                .setNom(p.getName())
                .setDateNaissance(p.getDateNaissance().toString())
                .setEmail(p.getEmail())
                .build();
        for (Vehicule v : vehicules) {
            Immatriculation.VehiculeResponse.Builder vehiculeBuilder = Immatriculation.VehiculeResponse.newBuilder();
            Immatriculation.VehiculeResponse vehicule = vehiculeBuilder
                    .setId(v.getId().toString())
                    .setMatricule(v.getMatricule())
                    .setMarque(v.getMarque())
                    .setModele(v.getModele())
                    .setPuissance(v.getPuissanceFiscale())
                    .setProprietaireId(v.getProprietaireID().toString())
                    .setProprietaire(pr)
                    .build();
            responseObserver.onNext(vehicule);
        }
        responseObserver.onCompleted();
        responseObserver.onError(new Exception("Error here !"));

    }


    @Override
    public void getProprietaires(Empty request, StreamObserver<Immatriculation.ProprietaireResponse> responseObserver) {
        List<Proprietaire> proprietaires = proprietaireRepository.findAll();
        Immatriculation.ProprietaireResponse.Builder builder = Immatriculation.ProprietaireResponse.newBuilder();
        for (Proprietaire p : proprietaires) {
            Immatriculation.ProprietaireResponse pr = builder.setId(p.getId().toString())
                    .setNom(p.getName())
                    .setDateNaissance(p.getDateNaissance().toString())
                    .setEmail(p.getEmail())
                    .build();
            responseObserver.onNext(pr);
        }
        responseObserver.onCompleted();

    }
}
