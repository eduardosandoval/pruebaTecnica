package com.pruebatecnica.service;

import java.util.List;

import com.pruebatecnica.dto.ClienteDTO;
import com.pruebatecnica.dto.FacturaDTO;
import com.pruebatecnica.entity.Camarero;
import com.pruebatecnica.entity.Cliente;
import com.pruebatecnica.entity.Cocinero;
import com.pruebatecnica.entity.Factura;
import com.pruebatecnica.entity.Mesa;

public interface FacturaService {

	List<Mesa> getMesaFactura();
	List<Camarero> getCamareroFactura();
	public int saveFactura(Factura facturaDTO);
	List<FacturaDTO> getFacturas();
	List<Factura> getFacturasId(int idFactura);
}
