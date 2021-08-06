function update() {
    let nummerInput = document.getElementById("nummer");
    let output = document.getElementById("output");
    let value = nummerInput.value
    const singles = ["nul", "een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen"];
    const double = ["tien", "elf", "twaalf", "dertien", "veertien", "vijftien", "zestien", "zeventien", "achtien", "negentien", "twintig"]
    value = eval(value);
    if (value >= 0 && value <= 20) {
        if (singles[value]) {
            output.innerHTML = singles[value]
        }
    }
    if (value >= 20) {
        if (double[value]) {
            output.innerHTML = singles[value]
        }
    }
}