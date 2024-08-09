package com.login.entities;




import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;

	// Entity representing a User in the system
	@Entity
	@Table(name = "users")
	public class User implements UserDetails{
	    
	    // Primary key for the User entity
	    @Id
//	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private String id;

	    // First name of the User
	    @Column(name = "firstName")
	    private String firstName;

	    // Last name of the User
	    @Column(name = "lastName")
	    private String lastName;

	    // Contact number of the User
	    @Column(name = "phone_No")
	    private String phoneNumber;

	    // Email address of the User
	    @Column(name = "mail")
	    private String email;

	    // Address of the User
	    @Column(name = "address")
	    private String address;

	    // Name of the firm associated with the User
	    @Column(name = "firmName")
	    private String firmName;

	    // GST Number of the firm associated with the User
	    @Column(name = "gstn")
	    private String gstin;

	    // Password for the User account
	    @Column(name = "password")
	    private String password;

	    // Confirmation password for the User account
	    @Column(name = "confirmPassword")
	    private String confirmPassword;

	    // Default constructor
	    public User() {
	        super();
	    }

	    // Parameterized constructor
	    public User(String firstName, String lastName, String phoneNumber, String email, String address, String firmName,
	                String gstin, String password, String confirmPassword) {
	        super();
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.phoneNumber = phoneNumber;
	        this.email = email;
	        this.address = address;
	        this.firmName = firmName;
	        this.gstin = gstin;
	        this.password = password;
	        this.confirmPassword = confirmPassword;
	    }


	    // Getters and setters

	    public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getFirmName() {
	        return firmName;
	    }

	    public void setFirmName(String firmName) {
	        this.firmName = firmName;
	    }

	    public String getGstin() {
	        return gstin;
	    }

	    public void setGstin(String gstin) {
	        this.gstin = gstin;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getConfirmPassword() {
	        return confirmPassword;
	    }

	    public void setConfirmPassword(String confirmPassword) {
	        this.confirmPassword = confirmPassword;
	    }

	    //unimplimented methods override
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getUsername() {
			// TODO Auto-generated method stub
			return this.email;
		}

		@Override
		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return true;
		}

	
	    
	    
	    
	}

