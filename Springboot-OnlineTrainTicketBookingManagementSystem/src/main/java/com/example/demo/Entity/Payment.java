package com.example.demo.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PaymentTable")
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer paymentId;
	private int Booking;
	private String paymentDate;
	private int paymentAmount;
	private String paymentStatus;

}
