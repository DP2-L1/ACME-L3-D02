
package acme.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.enums.Indicator;
import acme.framework.components.datatypes.Money;
import acme.roles.Lecturer;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Course {

	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "[A-Z]{1,3}[0,9]{3}", message = "code must follow pattern")
	protected String		code;

	@NotBlank
	@Length(max = 75)
	protected String		title;

	@NotBlank
	@Length(max = 100)
	protected String		abstracto;

	protected Indicator		indicator;

	@PositiveOrZero
	protected Money			retailPrice;

	@URL
	protected String		link;

	@OneToMany
	protected List<Lecture>	lecture;

	@ManyToOne
	protected Lecturer		lecturer;
}