package me.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import me.grpc.stubs.DeppassementVitasseServiceGrpc;
import me.grpc.stubs.DepassementVitasse;

import java.util.List;

public class RadarSimulation {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9091)
                .usePlaintext()
                .build();

        DeppassementVitasseServiceGrpc.DeppassementVitasseServiceBlockingStub stub = DeppassementVitasseServiceGrpc.newBlockingStub(channel);
        int i=0;
        while (i<8) {
            int radarId = 1;
            List<String> matricules = List.of("AA-123-BB", "AA-123-CC", "AA-123-DD", "AA-123-EE", "AA-123-FF", "AA-123-GG");
            String randomMatricule = matricules.get((int) (Math.random() * matricules.size()));
            double randomVitesse = 100 + Math.random() * 100;
            DepassementVitasse.DeppassementRequest request = DepassementVitasse.DeppassementRequest.newBuilder()
                    .setNumeroRadar(String.valueOf(radarId))
                    .setVehiculeMatricule(randomMatricule)
                    .setVitesseVehicule(String.valueOf(randomVitesse))
                    .build();

            DepassementVitasse.deppassementResponse response = stub.depasseVitsse(request);
            System.out.println(response);
            i++;
            Thread.sleep(3000);
        }
    }
}
