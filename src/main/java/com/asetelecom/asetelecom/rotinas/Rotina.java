package com.asetelecom.asetelecom.rotinas;

import java.io.IOException;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.asetelecom.asetelecom.Seguros;

@Component
public class Rotina {
	
	@Scheduled(cron = "30 16 16 * * *")
	public void cadastrarSeguros() throws InterruptedException, IOException{
		Seguros.cadastrarSeguros();
	}

}
