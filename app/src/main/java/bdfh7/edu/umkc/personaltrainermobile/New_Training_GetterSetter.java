package bdfh7.edu.umkc.personaltrainermobile;

/**
 * Created by brenodm on 4/15/15.
 */
public class New_Training_GetterSetter {

    private int id;
    private String name;
    private String gender;
    private float height;
    private float weight;
    private int age;


    public New_Training_GetterSetter() {

    }

    public New_Training_GetterSetter(int id, String name, String gender, float height, float weight, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.age = age;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " Name: " + name + '\n' +
                " Weight: " + weight + '\n' +
                " Gender: " + gender;
    }
}
