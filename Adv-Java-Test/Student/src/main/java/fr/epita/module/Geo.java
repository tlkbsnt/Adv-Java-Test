package fr.epita.module;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;

    @Data
    @AllArgsConstructor
    @Embeddable
    public class Geo {

        private String lat;
        private String lng;
        public Geo() {}

    }

