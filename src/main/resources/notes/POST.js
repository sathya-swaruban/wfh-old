(async function createRequest() {
    let request = {
        "requestId": "3",
        "startDate": "15-Nov-2023",
        "endDate": "15-Nov-2023",
        "startTime": "09:00",
        "endTime": "18:15"
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