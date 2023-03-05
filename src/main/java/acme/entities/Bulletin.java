
package acme.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bulletin {

	@Past
	private Date	instationMoment;

	@NotBlank
	@Length(max = 75)
	private String	title;

	@NotBlank
	@Length(max = 100)
	private String	message;

	@NotNull
	private Boolean	isCritical;

	private String	link;
}
