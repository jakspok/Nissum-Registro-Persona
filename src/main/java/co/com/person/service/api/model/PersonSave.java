package co.com.person.service.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonSave implements Serializable {

  private String id;
  private String created;
  private String modified;
  private String last_login;
  private String token;
  private String isactive;
}
