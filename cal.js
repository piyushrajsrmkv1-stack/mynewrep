// demo.js

function calculateTotal(price, quantity) {

    // Intentional error: variable 'taxRate' is not defined
    let total = (price * quantity) + (price * quantity * taxRate);

    return total;
}

console.log("Total Amount:", calculateTotal(100, 2));
