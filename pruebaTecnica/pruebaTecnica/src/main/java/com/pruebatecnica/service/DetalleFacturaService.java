package com.pruebatecnica.service;

import java.util.List;

import com.pruebatecnica.entity.DetalleFactura;

public interface DetalleFacturaService {
    
	
List<DetalleFactura> getDetalleFacturaId(int idFactura);
public int saveDetalleFactura(DetalleFactura detalleFactura);
	
}
