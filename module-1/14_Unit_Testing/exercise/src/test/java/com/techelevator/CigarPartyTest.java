package com.techelevator;

import org.junit.Test;

public class CigarPartyTest {
    @Test
    public void ProvideWeekdayCigars_ExpectTrue(){

        boolean isSuccessful = false;
        CigarParty party = new CigarParty();
        isSuccessful = party.haveParty(40,false);
        assertEquals( true, isSuccessful);
    }

    }

