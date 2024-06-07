package de.neuefische;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Doctors {

    private Map<String, Doctor> doctorMap = new HashMap<>();

    public void addDoc(Doctor doc){
        doctorMap.put(doc.getId(), doc);
    }

    public Optional<Doctor> findDoc(String num){
        return Optional.ofNullable(doctorMap.get(num));
    }
}
