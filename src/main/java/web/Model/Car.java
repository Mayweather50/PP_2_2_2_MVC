package web.Model;

import javax.persistence.*;

@Entity
@Table()
public class Car {
    public Car(){}

    public Car(Long id, String marka, String model) {
        this.id = id;
        this.marka = marka;
        this.model = model;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "marka")
    private String marka;
    @Column(name = "model")
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
