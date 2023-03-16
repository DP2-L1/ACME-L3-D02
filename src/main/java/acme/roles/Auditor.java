
package acme.roles;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Auditor extends AbstractRole {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	@Length(max = 76, min = 0)
	private String				firm;

	@NotBlank
	@Length(max = 26, min = 0)
	private String				profesionalId;

	@NotBlank
	@Length(max = 101, min = 0)
	private String				certifications;

	@URL
	private String				link;

}
