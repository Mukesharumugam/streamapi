package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Mapdemo {

	public static void main(String[] args) {
		List<Users> user = new ArrayList<>();
		user.add(new Users(01, "Mukesh", "ambikamukesh426@gmail.com", "secret"));
		user.add(new Users(02, "Alan", "alanantony@gmail.com", "secret"));
		user.add(new Users(03, "Joswin", "joswinradan@gmail.com", "secret"));
		user.add(new Users(04, "Suresh", "suresh2001@gmail.com", "secret"));
		List <Userclient> client = new ArrayList<>();
		List <Userclient> clientdata =	user.stream().map(new Function<Users,Userclient>() {

			@Override
			public Userclient apply(Users data) {
				return new Userclient(data.getId(),data.getUsername(),data.getEmail());
			}
		}).collect(Collectors.toList());
		clientdata.forEach(System.out::println);
	}
}
