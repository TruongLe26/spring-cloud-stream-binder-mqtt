package org.springframework.cloud.binder.mqtt.properties;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
public class MqttSinkProperties implements ClientIdAware, CredentialsAware {

  @NotBlank
  @Size(min = 1, max = 23)
  private String clientId = "stream.client.id.sink";

  private String username;
  private String password;
  @Range(min = 0 , max = 2)
  private int qos = 1;
}
