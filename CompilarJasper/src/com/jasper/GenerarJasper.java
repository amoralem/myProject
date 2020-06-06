package com.jasper;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;

public class GenerarJasper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			JasperCompileManager.compileReportToFile("C:/jasper/ReporteGenerico2.jrxml");
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
