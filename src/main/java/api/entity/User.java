package api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "phone")
    private String phone;

    @OneToMany(mappedBy = "sender", fetch = FetchType.LAZY)
    private List<Order> sentOrders;

    @OneToMany(mappedBy = "recipient", fetch = FetchType.LAZY)
    private List<Order> receivedOrders;

}
