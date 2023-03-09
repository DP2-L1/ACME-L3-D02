
package acme.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;

import acme.framework.components.accounts.Administrator;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bulletin extends AbstractEntity {

	@Past
	private Date			instationMoment;

	@NotBlank
	@Length(max = 75)
	private String			title;

	@NotBlank
	@Length(max = 100)
	private String			message;

	@NotNull
	private Boolean			isCritical;

	private String			link;

	@ManyToOne
	@JoinColumn(name = "administrator_id")
	private Administrator	administrator;

}
