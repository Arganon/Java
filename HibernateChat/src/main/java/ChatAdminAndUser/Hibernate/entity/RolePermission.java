package ChatAdminAndUser.Hibernate.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "role_permission")
public class RolePermission implements Serializable {
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "role_id")
	private Role role;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "permission_id")
	private Permission permission;

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}
}
