// This class manages a list of Expense objects and includes methods to add,
// list, and summarize expenses, as well as to validate inputs and handle file data.
public class ExpenseManager {
    mport java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenses;

    public ExpenseManager() {
        this.expenses = new ArrayList<>();
    }

    public void agregarGasto(Expense gasto) {
        // Validar y agregar el gasto a la lista
    }

    public List<Expense> listarGastos() {
        // Devolver la lista de gastos
        return expenses;
    }

    public double resumirGastos() {
        // Calcular y devolver el monto total de los gastos
        return 0.0;
    }

}
}
