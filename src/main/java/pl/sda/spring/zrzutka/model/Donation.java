package pl.sda.spring.zrzutka.model;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Donation {

    @Id
    @GeneratedValue(generator = "donatSeq")
    @SequenceGenerator(name = "donatSeq", sequenceName = "donat_seq", allocationSize = 1)
    private Long id;

    @ManyToOne(targetEntity = Whipround.class)
    private Whipround whipround;
    private BigDecimal amount;

    @Embedded
    private User user;

    public Donation(Whipround whipround, BigDecimal amount) {
        this.whipround = whipround;
        this.amount = amount;
        this.user = new User();
    }

    public Donation() {
        this.user = new User();

    }

    public String getFirstName(){
        if (user == null){
            return "";
        }
        return user.getFirstName();
    }
    public String getLastName(){
        if (user == null){
            return "";
        }
        return user.getLastName();
    }
    public String getEmail(){
        if (user == null){
            return "";
        }
        return user.getEmail();
    }
    public void SetFirstName(String firstName){
        if (user == null){
            user = new User();
        }
        user.setFirstName(firstName);
    }
    public void SetLastName(String lastName){
        if (user == null){
            user = new User();
        }
        user.setLastName(lastName);
    }
    public void SetEmail(String email){
        if (user == null){
            user = new User();
        }
        user.setEmail(email);
    }

    public User getUser() {
        return user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Whipround getWhipround() {
        return whipround;
    }

    public void setWhipround(Whipround whipround) {
        this.whipround = whipround;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Donation)) return false;
        Donation donation = (Donation) o;
        return Objects.equals(getId(), donation.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Donation{" +
                "id=" + id +
                ", whiproud=" + whipround +
                ", amount=" + amount +
                '}';
    }
}
