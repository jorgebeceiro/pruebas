package com.jorge.exampleweb.cxf.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.jorge.exampleweb.cxf.model.Player;

@WebService
public interface ITeamService {
	 List<Player> getTeam();
     
	    List<Player> getPlayers(int... numbers);
	     
	    @WebMethod(operationName="actualizar")
	    @WebResult(name="booleano", targetNamespace="http://com.jorge.exampleweb.resultado")
	    boolean updatePlayerByNumber(int number,  @WebParam(header = true, name = "jugador", targetNamespace = "http://com.jorge.exampleweb.jugador")Player player);
	     
	    boolean deletePlayer(int number);
	     
	    void foo();
}
