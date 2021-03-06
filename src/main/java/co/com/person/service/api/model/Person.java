package co.com.person.service.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "USER_REG_TBL")
public class Person {

  @Id @GeneratedValue private int id;

  @NotNull(message = "name is required")
  @Size(max = 20, message = "Name has a maximum of 20 characters")
  private String name;

  @Transient private UUID corrId = UUID.randomUUID();

  @NotNull(message = "email is required")
  @Size(max = 20, message = "email has a maximum of 20 characters")
  private String email;

  @NotNull(message = "password is required")
  @Size(max = 20, message = "password has a maximum of 10 characters")
  private String password;

  @OneToOne(targetEntity = Phones.class, fetch = FetchType.EAGER)
  @JoinColumn(nullable = false, name = "user_id")
  @NotNull(message = "cellPhone is required")
  @Size(max = 20, message = "cellPhone has a maximum of 20 characters")
  private Phones cellPhone;
}
