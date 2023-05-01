package br.com.fiap.checkpoint2.service;

import br.com.fiap.checkpoint2.model.Pedido;
import br.com.fiap.checkpoint2.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> list(){
        return pedidoRepository.findAll();
    }

    public Pedido save(Pedido pedido){
        return pedidoRepository.save(pedido);
    }
}
