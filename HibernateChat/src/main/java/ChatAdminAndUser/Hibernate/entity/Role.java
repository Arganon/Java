package ChatAdminAndUser.Hibernate.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToMany(orphanRemoval = true, mappedBy = "role", cascade = CascadeType.ALL)
	private List<User> users;
	
	@OneToMany(orphanRemoval = true, mappedBy = "role", cascade = CascadeType.ALL)
	private List<RolePermission> rolePermissions;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<RolePermission> getRolePermission() {
		return rolePermissions;
	}

	public void setRolePermission(List<RolePermission> rolePermission) {
		this.rolePermissions = rolePermission;
	}

	public void setPermissions(List<Permission> memberPermissions) {
		List<RolePermission> rolePermissions = new ArrayList<>();
		
		for (Permission permission : memberPermissions) {
            RolePermission rolePermission = new RolePermission();
            rolePermission.setRole(this);
            rolePermission.setPermission(permission);
            rolePermissions.add(rolePermission);
		}
		this.rolePermissions = rolePermissions;
	}
}
