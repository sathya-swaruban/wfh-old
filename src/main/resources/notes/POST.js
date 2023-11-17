(async function createRequest() {
    let request = {
        "fromDate": "17-Nov-2023",
        "toDate": "17-Nov-2023",
        "fromTime": "09:00",
        "toTime": "18:15"
    };
    await fetch('http://localhost:8080/add_request', {
        method: "POST",
        headers: {
            "Accept": "application/json",
            "Content-Type": "application/json"
        },
        body: JSON.stringify(request)
    }).then(result => result.text()).then(text => alert(text));
})();