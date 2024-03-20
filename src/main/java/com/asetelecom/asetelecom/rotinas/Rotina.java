package com.asetelecom.asetelecom.rotinas;

import java.io.IOException;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.asetelecom.asetelecom.Seguros;

@Component
public class Rotina {
	
	@Scheduled(cron = "40 20 10 * * *")
	public void cadastrarSeguros() throws InterruptedException, IOException{
		Seguros.cadastrarSeguros();
	}
}
