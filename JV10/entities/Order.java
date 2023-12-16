package JV10.entities;

import java.util.Date;
import java.util.List;

import JV10.entities_enum.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Order
{
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> itens = new ArrayList<>();

    public Order()
    {
    }

    public Order(Date moment, OrderStatus status, Client client)
    {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment()
    {
        return (moment);
    }

    public void setMoment(Date moment)
    {
        this.moment = moment;
    }

    public OrderStatus getStatus()
    {
        return (status);
    }

    public void setStatus(OrderStatus status)
    {
        this.status = status;
    }

    public Client getClient()
    {
        return (client);
    }

    public void setClient(Client client)
    {
        this.client = client;
    }

    public void addItens(OrderItem item)
    {
        itens.add(item);
    }

    public void removeItens(OrderItem item)
    {
        itens.remove(item);
    }

    public Double total()
    {
        Double total = 0.0;

        for(OrderItem x : itens)
        {
            total += x.subTotal();
        }
        return (total);
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append(client + "\n");
        sb.append("Order items: \n");
        for(OrderItem it : itens)
        {
            sb.append(it + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return (sb.toString());
    }
}