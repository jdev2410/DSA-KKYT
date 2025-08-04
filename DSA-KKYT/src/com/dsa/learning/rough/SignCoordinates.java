package com.dsa.learning.rough;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class SignCoordinates {
    public LinkedHashMap<Integer,SignerEmailMobile> map;

    static class SignerEmailMobile{
        public List<SigningCordinates> cordinates;

        public SignerEmailMobile(List<SigningCordinates> cordinates) {
            this.cordinates = cordinates;
        }

        public List<SigningCordinates> getCordinates() {
            return cordinates;
        }

        public void setCordinates(List<SigningCordinates> cordinates) {
            this.cordinates = cordinates;
        }

        @Override
        public String toString() {
            return "SignerEmailMobile{" +
                    "cordinates=" + cordinates +
                    '}';
        }
    }

    public SignCoordinates(LinkedHashMap<Integer, SignerEmailMobile> map) {
        this.map = map;
    }

    public LinkedHashMap<Integer, SignerEmailMobile> getMap() {
        return map;
    }

    public void setMap(LinkedHashMap<Integer, SignerEmailMobile> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "SignCoordinates{" +
                "map=" + map +
                '}';
    }
}
