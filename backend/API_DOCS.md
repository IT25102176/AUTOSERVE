# Car Service Backend API Docs (Postman Guide)

This document explains how to test all backend endpoints using Postman.

## 1) Prerequisites

- Start backend server:
  - From `backend/` run: `mvn spring-boot:run`
- Default base URL:
  - `http://localhost:8080`
- Common headers for `POST` / `PUT`:
  - `Content-Type: application/json`

## 2) Quick Postman Setup

1. Open Postman and create a new Collection: `Car Service API`.
2. Add a collection variable:
   - `baseUrl = http://localhost:8080`
3. Use endpoint format like:
   - `{{baseUrl}}/api/users`

## 3) Date-Time Format

For all `LocalDateTime` fields, use ISO format:

- Example: `2026-04-24T10:30:00`

---

## 4) User Management API

Base path: `/api/users`

### Create User
- Method: `POST`
- URL: `{{baseUrl}}/api/users`
- Body:
```json
{
  "name": "John Silva",
  "email": "john.silva@example.com",
  "phone": "0771234567",
  "role": "technician"
}
```

### Get All Users
- Method: `GET`
- URL: `{{baseUrl}}/api/users`

### Get User by ID
- Method: `GET`
- URL: `{{baseUrl}}/api/users/{id}`

### Update User
- Method: `PUT`
- URL: `{{baseUrl}}/api/users/{id}`
- Body:
```json
{
  "name": "John Silva Updated",
  "email": "john.updated@example.com",
  "phone": "0779999999",
  "role": "manager"
}
```

### Delete User
- Method: `DELETE`
- URL: `{{baseUrl}}/api/users/{id}`

---

## 5) Vehicle Management API

Base path: `/api/vehicles`

### Create Vehicle
- Method: `POST`
- URL: `{{baseUrl}}/api/vehicles`
- Body:
```json
{
  "ownerUserId": "user-id-here",
  "make": "Toyota",
  "model": "Corolla",
  "year": 2020,
  "licensePlate": "CAA-1234",
  "vin": "1HGCM82633A123456",
  "mileage": 42000,
  "lastServiceDate": "2026-04-01T09:00:00"
}
```

### Get All Vehicles
- Method: `GET`
- URL: `{{baseUrl}}/api/vehicles`

### Get Vehicle by ID
- Method: `GET`
- URL: `{{baseUrl}}/api/vehicles/{id}`

### Update Vehicle
- Method: `PUT`
- URL: `{{baseUrl}}/api/vehicles/{id}`
- Body:
```json
{
  "ownerUserId": "user-id-here",
  "make": "Toyota",
  "model": "Corolla",
  "year": 2021,
  "licensePlate": "CAA-1234",
  "vin": "1HGCM82633A123456",
  "mileage": 45000,
  "lastServiceDate": "2026-04-20T11:30:00"
}
```

### Delete Vehicle
- Method: `DELETE`
- URL: `{{baseUrl}}/api/vehicles/{id}`

---

## 6) Services API

Base path: `/api/services`

### Create Service Record
- Method: `POST`
- URL: `{{baseUrl}}/api/services`
- Body:
```json
{
  "vehicleId": "vehicle-id-here",
  "vehicleName": "2020 Toyota Corolla (CAA-1234)",
  "serviceType": "Oil Change",
  "description": "Engine oil and filter replacement",
  "cost": 8500.0,
  "status": "completed",
  "completedDate": "2026-04-24T10:30:00",
  "updatedAt": "2026-04-24T10:30:00"
}
```

### Get All Service Records
- Method: `GET`
- URL: `{{baseUrl}}/api/services`

### Get Service Record by ID
- Method: `GET`
- URL: `{{baseUrl}}/api/services/{id}`

### Update Service Record
- Method: `PUT`
- URL: `{{baseUrl}}/api/services/{id}`
- Body:
```json
{
  "vehicleId": "vehicle-id-here",
  "vehicleName": "2020 Toyota Corolla (CAA-1234)",
  "serviceType": "Major Service",
  "description": "Full service package",
  "cost": 18500.0,
  "status": "in-progress",
  "completedDate": null,
  "updatedAt": "2026-04-25T09:00:00"
}
```

### Delete Service Record
- Method: `DELETE`
- URL: `{{baseUrl}}/api/services/{id}`

---

## 7) Maintenance API

Base path: `/api/maintenance`

### Create Maintenance Reminder
- Method: `POST`
- URL: `{{baseUrl}}/api/maintenance`
- Body:
```json
{
  "vehicleId": "vehicle-id-here",
  "vehicleName": "2020 Toyota Corolla (CAA-1234)",
  "serviceType": "Brake Check",
  "dueDate": "2026-05-15T09:00:00",
  "dueMileage": 50000,
  "currentMileage": 45000,
  "priority": "high",
  "status": "pending",
  "notes": "Check front brake pads"
}
```

### Get All Maintenance Reminders
- Method: `GET`
- URL: `{{baseUrl}}/api/maintenance`

### Get Maintenance Reminder by ID
- Method: `GET`
- URL: `{{baseUrl}}/api/maintenance/{id}`

### Update Maintenance Reminder
- Method: `PUT`
- URL: `{{baseUrl}}/api/maintenance/{id}`
- Body:
```json
{
  "vehicleId": "vehicle-id-here",
  "vehicleName": "2020 Toyota Corolla (CAA-1234)",
  "serviceType": "Brake Check",
  "dueDate": "2026-05-20T09:00:00",
  "dueMileage": 52000,
  "currentMileage": 47000,
  "priority": "medium",
  "status": "overdue",
  "notes": "Customer requested postponement"
}
```

### Delete Maintenance Reminder
- Method: `DELETE`
- URL: `{{baseUrl}}/api/maintenance/{id}`

---

## 8) Appointments API

Base path: `/api/appointments`

### Create Appointment
- Method: `POST`
- URL: `{{baseUrl}}/api/appointments`
- Body:
```json
{
  "vehicleId": "vehicle-id-here",
  "vehicleName": "2020 Toyota Corolla (CAA-1234)",
  "customerName": "Nimal Perera",
  "appointmentDate": "2026-04-30T09:00:00",
  "serviceType": "AC Service",
  "notes": "Customer says AC cooling is weak",
  "status": "scheduled",
  "assignedTechnicianId": "user-id-here"
}
```

### Get All Appointments
- Method: `GET`
- URL: `{{baseUrl}}/api/appointments`

### Get Appointment by ID
- Method: `GET`
- URL: `{{baseUrl}}/api/appointments/{id}`

### Update Appointment
- Method: `PUT`
- URL: `{{baseUrl}}/api/appointments/{id}`
- Body:
```json
{
  "vehicleId": "vehicle-id-here",
  "vehicleName": "2020 Toyota Corolla (CAA-1234)",
  "customerName": "Nimal Perera",
  "appointmentDate": "2026-04-30T11:00:00",
  "serviceType": "AC Service",
  "notes": "Appointment shifted to 11 AM",
  "status": "scheduled",
  "assignedTechnicianId": "user-id-here"
}
```

### Delete Appointment
- Method: `DELETE`
- URL: `{{baseUrl}}/api/appointments/{id}`

---

## 9) Billing / Invoices API

Base path: `/api/invoices`

### Create Invoice
- Method: `POST`
- URL: `{{baseUrl}}/api/invoices`
- Body:
```json
{
  "serviceId": "service-id-here",
  "vehicleName": "2020 Toyota Corolla (CAA-1234)",
  "customerName": "Nimal Perera",
  "amount": 15000.0,
  "tax": 2700.0,
  "total": 17700.0,
  "status": "pending",
  "issueDate": "2026-04-24T09:00:00",
  "dueDate": "2026-05-24T09:00:00",
  "paidDate": null,
  "description": "AC service invoice"
}
```

### Get All Invoices
- Method: `GET`
- URL: `{{baseUrl}}/api/invoices`

### Get Invoice by ID
- Method: `GET`
- URL: `{{baseUrl}}/api/invoices/{id}`

### Update Invoice
- Method: `PUT`
- URL: `{{baseUrl}}/api/invoices/{id}`
- Body:
```json
{
  "serviceId": "service-id-here",
  "vehicleName": "2020 Toyota Corolla (CAA-1234)",
  "customerName": "Nimal Perera",
  "amount": 15000.0,
  "tax": 2700.0,
  "total": 17700.0,
  "status": "paid",
  "issueDate": "2026-04-24T09:00:00",
  "dueDate": "2026-05-24T09:00:00",
  "paidDate": "2026-04-25T14:15:00",
  "description": "Paid in full"
}
```

### Delete Invoice
- Method: `DELETE`
- URL: `{{baseUrl}}/api/invoices/{id}`

---

## 10) Suggested Testing Order in Postman

To avoid ID issues, test in this order:

1. Create vehicle owner `User` (any role)
2. Create technician `User` (role = `technician`)
3. Create `Vehicle` using `ownerUserId`
4. Create `Service Record` using `vehicleId`
5. Create `Appointment` using `vehicleId` and technician `assignedTechnicianId`
6. Create `Maintenance Reminder` using `vehicleId`
7. Create `Invoice` using `serviceId`

---

## 11) Notes

- `id` is auto-generated by backend if not provided.
- `createdAt` is auto-set by backend when missing.
- Vehicle owner details (`ownerName`, `ownerPhone`, `ownerEmail`) are auto-filled from `ownerUserId`.
- `vehicleId`, `serviceId`, `assignedTechnicianId`, and `ownerUserId` are validated against existing records.
- Assigned technician must be a `User` with role `technician`.
- Backend blocks deleting linked records (example: deleting a vehicle that already has services/appointments/maintenance).
- If a record is not found for update/delete/get by id, backend returns an error.
- Data is stored in JSON files under the backend storage directory configured by:
  - `app.storage.dir=data`
