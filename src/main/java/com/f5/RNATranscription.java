package com.f5;

public class RNATranscription {

    public static String transcribe(String dna) {

        StringBuilder rna = new StringBuilder();

        for (char nucleotide : dna.toCharArray()) {
            switch (nucleotide) {
                case 'G':
                    rna.append('C');
                    break;
                case 'C':
                    rna.append('G');
                    break;
                case 'T':
                    rna.append('A');
                    break;
                case 'A':
                    rna.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Invalid nucleotide in DNA sequence");
            }
        }

        return rna.toString();
    }
}
