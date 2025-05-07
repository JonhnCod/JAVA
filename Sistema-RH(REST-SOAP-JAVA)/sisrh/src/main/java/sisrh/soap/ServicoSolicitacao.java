package sisrh.soap;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.WebServiceContext;

import sisrh.banco.Banco;
import sisrh.dto.Solicitacao;
import sisrh.dto.Solicitacoes;
import sisrh.seguranca.Autenticador;

@WebService
@SOAPBinding(style = Style.RPC)
public class ServicoSolicitacao {
	
	@Resource
	WebServiceContext context;

	@WebMethod(action = "listar")
	public Solicitacoes listarSolicitacoes() throws Exception {
		
		Autenticador.autenticarUsuarioSenha(context);

		Solicitacoes solicitacoess = new Solicitacoes();
		
		List<Solicitacao> lista = Banco.listarSolicitacoes();
		for(Solicitacao sol: lista) {
			solicitacoess.getSolicitacoes().add(sol);
		}
		return solicitacoess;
	}
	
	@WebMethod(action = "listar")
	public Solicitacoes listarSolicitacoesPorusuario() throws Exception {
		
		Autenticador.autenticarUsuarioSenha(context);
		
		String usuario = Autenticador.getUsuario(context);
		
		Solicitacoes solicitacoess = new Solicitacoes();
	
		List<Solicitacao> lista = Banco.listarSolicitacoesPorUsuario(usuario);
		for(Solicitacao sol: lista) {
			solicitacoess.getSolicitacoes().add(sol);
		}
		return solicitacoess;
	}
}


