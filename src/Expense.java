public class Expense {
    private double cantidadGasto;
    private String categoriaGasto;
    
    public Expense(double cantidadGasto, String categoriaGasto) {
        if (cantidadGasto <= 0) {
            throw new IllegalArgumentException("La cantidad gastada debe ser mayor que cero.");
        }
        if (categoriaGasto == null || categoriaGasto.trim().isEmpty()) {
            throw new IllegalArgumentException("La categoría del gasto no puede estar vacía.");
        }
        
        this.cantidadGasto = cantidadGasto;
        this.categoriaGasto = categoriaGasto.trim();
    }
    
    // Métodos para acceder a las variables (get
