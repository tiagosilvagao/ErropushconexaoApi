package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoCadastroClientes {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// BlocoCadastroClientes
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			private Var nome = Var.VAR_NULL;
			private Var xTipoToken = Var.VAR_NULL;
			private Var Token = Var.VAR_NULL;
			private Var retorno = Var.VAR_NULL;

			public Var call() throws Exception {
				nome = Var.valueOf("FLAMENGO");
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
						nome);
				xTipoToken = Var.valueOf("access_token");
				Token = Var.valueOf("E7FlXo2AxQSp");
				retorno = cronapi.util.Operations.getURLFromOthers(Var.valueOf("POST"), Var.valueOf("application/json"),
						Var.valueOf("https://api.superlogica.net/v2/financeiro/clientes"),
						cronapi.map.Operations.createObjectMapWith(Var.valueOf("ST_NOME_SAC", nome)),
						cronapi.map.Operations.createObjectMapWith(Var.valueOf("tipo_token", xTipoToken),
								Var.valueOf("token", Token)));
				cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
						retorno);
				return Var.VAR_NULL;
			}
		}.call();
	}

}
