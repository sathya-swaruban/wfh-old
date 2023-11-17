async function initialize() {
    const response = await fetch(
        'http://localhost:8080/current_date'
    ).then((res) => res.json());
    document.getElementById("fromDate").value = response;
    document.getElementById("toDate").value = response;
}