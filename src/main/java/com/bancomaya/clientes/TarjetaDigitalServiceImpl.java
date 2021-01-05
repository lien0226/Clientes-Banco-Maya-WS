package com.bancomaya.clientes;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.model.TarjetaDigital;

@WebService(endpointInterface = "com.bancomaya.clientes.TarjetaDigitalService")
public class TarjetaDigitalServiceImpl implements TarjetaDigitalService {

	private static List<TarjetaDigital> tarjetas = new ArrayList<TarjetaDigital>();
	
	@Override
	public TarjetaDigital crearTarjetaDigital(TarjetaDigital tarjeta) {
		// TODO Auto-generated method stub
		tarjeta.setId(tarjetas.size()+1);
		tarjetas.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<TarjetaDigital> obtenerTajetasDigitales() {
		// TODO Auto-generated method stub
		return tarjetas;
	}

	@Override
	public TarjetaDigital obtenerTarjetaNumero(String numeroTarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TarjetaDigital obtenerTarjetaNombreCliente(String nombreCliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
