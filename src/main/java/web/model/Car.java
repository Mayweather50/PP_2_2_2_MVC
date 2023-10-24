package web.model;


public class Car {
    public Car(){}

    public Car(Long id, String marka, String model) {
        this.id = id;
        this.marka = marka;
        this.model = model;
    }


    private Long id;

    private String marka;

    private String model;
    public Long getId() {
        return id;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }




}
