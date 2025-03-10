package com.f5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RnaTranscriptionTest {

    @Test
    void testTranscribeDnaToRna() {
       
        String dna = "GCTA";
        

        String expectedRna = "CGAU";
        
    
        assertEquals(expectedRna, RnaTranscription.transcribe(dna));
    }
}
