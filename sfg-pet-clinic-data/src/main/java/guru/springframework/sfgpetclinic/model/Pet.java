package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetType petType;
    private Owner Owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public guru.springframework.sfgpetclinic.model.Owner getOwner() {
        return Owner;
    }

    public void setOwner(guru.springframework.sfgpetclinic.model.Owner owner) {
        Owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
