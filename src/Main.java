public class Main {
    public static void main(String[] args) {
        ProductoDAO productoDAO = new ProductoDAOImpl();

        // Agregar productos
        productoDAO.agregarProducto(new Producto(1, "Laptop", 1200.50));
        productoDAO.agregarProducto(new Producto(2, "Mouse", 25.99));

        // Obtener y mostrar todos los productos
        System.out.println("Lista de productos:");
        for (Producto p : productoDAO.obtenerTodosLosProductos()) {
            System.out.println(p.getNombre() + " - $" + p.getPrecio());
        }

        // Actualizar un producto
        Producto producto = productoDAO.obtenerProducto(1);
        if (producto != null) {
            producto.setPrecio(1100.00);
            productoDAO.actualizarProducto(producto);
        }

        // Eliminar un producto
        productoDAO.eliminarProducto(2);

        // Mostrar la lista actualizada
        System.out.println("Productos después de la actualización y eliminación:");
        for (Producto p : productoDAO.obtenerTodosLosProductos()) {
            System.out.println(p.getNombre() + " - $" + p.getPrecio());
        }
    }
}
