package it.webservice.utils;

import java.io.Serializable;
import java.util.ArrayList;

public class GenericResponse implements Serializable {

	private static final long serialVersionUID = -7686134585986218617L;

	private Boolean esitoOk;
	private ArrayList<String> msgs;
	private Object ret;

	public Boolean getEsitoOk() {
		return esitoOk;
	}

	public void setEsitoOk(Boolean esitoOk) {
		this.esitoOk = esitoOk;
	}

	public ArrayList<String> getMsgs() {
		return msgs;
	}

	public void setMsgs(ArrayList<String> msgs) {
		this.msgs = msgs;
	}

	public Object getRet() {
		return ret;
	}

	public void setRet(Object ret) {
		this.ret = ret;
	}
}