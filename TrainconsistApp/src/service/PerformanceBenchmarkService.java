package service;

import model.Bogie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PerformanceBenchmarkService {

    public void compareLoopVsStream(List<Bogie> bogies) {

        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();

        for (Bogie bogie : bogies) {

            if (bogie.getCapacity() > 60) {

                loopResult.add(bogie);

            }

        }

        long loopEnd = System.nanoTime();

        long loopTime = loopEnd - loopStart;

        long streamStart = System.nanoTime();

        List<Bogie> streamResult =
                bogies.stream()
                        .filter(b -> b.getCapacity() > 60)
                        .collect(Collectors.toList());

        long streamEnd = System.nanoTime();

        long streamTime = streamEnd - streamStart;

        System.out.println();
        System.out.println("===== Performance Comparison =====");

        System.out.println("Loop Result Count : "
                + loopResult.size());

        System.out.println("Loop Time (ns) : "
                + loopTime);

        System.out.println();

        System.out.println("Stream Result Count : "
                + streamResult.size());

        System.out.println("Stream Time (ns) : "
                + streamTime);
    }
}