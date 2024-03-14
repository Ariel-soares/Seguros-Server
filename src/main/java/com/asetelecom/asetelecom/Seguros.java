package com.asetelecom.asetelecom;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.asetelecom.asetelecom.db.DB;
import com.asetelecom.asetelecom.db.DbException;
import com.asetelecom.asetelecom.db.DbServicos;

public class Seguros {

	public static void cadastrarSeguros() throws IOException, InterruptedException {

		Connection conn = DB.getConnection();
		ResultSet rs = DbServicos.consultarServicos(conn);
		Statement st = null;
		conn = DB.getConnection();

		rs = DbServicos.consultarServicos(conn);

		try {
			while (rs.next()) {
				System.out.println(rs.getString("nome_servico"));
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}

		/*
		 * try { while (rs.next()) { System.out.println(rs.getString("nome_servico")); }
		 * } catch (SQLException e) { throw new DbException(e.getMessage()); }
		 */

		/*
		 * String token_original =
		 * "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjM3M2NkOWExM2JkOWJmZWQxMDM0MjlkZGU5NDU0OGM3NGYyNmQwZmRiMjAwMWE1ODZhNThkZWNjZDFmODJjZmVmMjBhNWE0MGQxMWZjOWIzIn0.eyJhdWQiOiIyNSIsImp0aSI6IjM3M2NkOWExM2JkOWJmZWQxMDM0MjlkZGU5NDU0OGM3NGYyNmQwZmRiMjAwMWE1ODZhNThkZWNjZDFmODJjZmVmMjBhNWE0MGQxMWZjOWIzIiwiaWF0IjoxNzEwMTc3NjU5LCJuYmYiOjE3MTAxNzc2NTksImV4cCI6MTcxMjc2OTY1OSwic3ViIjoiMjkzIiwic2NvcGVzIjpbXX0.Q8JuDB2DsDGLHR7NTmyopD4jyd9PHKAgMZs4_XE28AilLnirZ4cUKaxe0gGY8gw1b14hECkDtWbEeHEyNaRXcMCf8pRlIaJMDsvoVWXPli5u47QPZ3vc1WM3FrGDiwivGWDoNEKwOXP8MR8Q_sjgx4lDpLK0e3pKStyE9GBPG1hC_YRRw3_qPPuzuk9GTiToIBdtIeR6RfxPBwGUyOm-p7yOzgFCPhB8NPgp7slT2gSissgy4OXoiG_GE4XKikSOQuqKDz4EdChW6cmqpqexHJJHeMHACAY_NBUDp0eEuOKhCvzf4MAufTyaLf3Qcr8S4ohxAUQS5l9Liy5VUFUlDUU5ASoHpxnGYZSha7KhDOlrwoeK9tsi8vAPCH4WY_jqkQInKS2B-3fW_Ib80eUMEKZpGTWkf5n8xjxSKCvUv2gymeTHxzNowydz5KN_Gh9cR_2fjl5lakFLCMHNBhrVu62nc2grpQnbFGMHQ-v5Im4RhU46mjEEkHzbM8ZzX7Mvtnf0pOE0QYI7cGxDoCh0IaJKogUdotc-ymyv_gnX08iz0--T5DwVsimy6ms_kSPx7ouObvY3e-4CR-M3n0I18GNlMv6rLj0g3seN5TqxOXTvxPwuvOYJnB8LPF45Z4qtRx4bhrBR6J9JPv-XuGYh8EaknxHeyyYiX3KYX9Obf7I";
		 * 
		 * LocalDate horario = LocalDate.now().minusDays(1); DateTimeFormatter formatter
		 * = DateTimeFormatter.ofPattern("yyyy-MM-dd"); String horario_atual =
		 * horario.format(formatter);
		 * 
		 * HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(
		 * "https://api.asetelecom.hubsoft.com.br/api/v1/integracao/cliente/todos?pagina=0&itens_por_pagina=500&data_inicio="
		 * + horario_atual)) .header("Content-Type",
		 * "application/json").header("Authorization", "Bearer " +
		 * token_original).build();
		 * 
		 * HttpClient httpClient =
		 * HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(3)).build();
		 * 
		 * HttpResponse<String> response = httpClient.send(request,
		 * BodyHandlers.ofString());
		 * 
		 * System.out.println(response.body());
		 * System.out.println(response.statusCode());
		 * System.out.println(response.headers());
		 * 
		 * Resposta resposta;
		 * 
		 * if (response.statusCode() == 200) { ObjectMapper mapper = new ObjectMapper();
		 * resposta = mapper.readValue(response.body(), Resposta.class);
		 * 
		 * System.out.println(resposta);
		 * 
		 * System.out.println(resposta.getClientes());
		 * 
		 * } else { System.out.println("Error in sending a GET request"); }
		 */
		DB.closeResultSet(rs);
		DB.closeConnection();
		DB.closeStatement(st);
	}
}
