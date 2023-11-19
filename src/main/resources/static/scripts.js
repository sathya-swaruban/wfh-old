async function initialize() {
    const response = await fetch(
        'http://localhost:8080/current_date'
    ).then((res) => res.json());
    document.getElementById("fromDate").value = response;
    document.getElementById("toDate").value = response;
}

async function submitRequest() {
    let request = {
        "fromDateTime": fromDate.value + " " + fromTime.value,
        "toDateTime": toDate.value + " " + toTime.value,
    };
    await fetch('http://localhost:8080/add_request', {
        method: "POST",
        headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        body: JSON.stringify(request)
    }).then(result => result.text()).then(text => alert(text));
}