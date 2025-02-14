package za.ac.tut.business;

public class AgeCategoryClass {

    public AgeCategoryClass() {
    }

    public String determineAgeCategory(int age) {
        String category = "  ";

        if (age >= 0 && age <= 14) {
            category = "Child";
        } else if (age >= 15 && age <= 24) {
            category = "Youth";

        } else if (age >= 26 && age <= 64) {
            category = "Adult";
        } else {
            category = "Senoir";
        }
        return category;

    }

}
