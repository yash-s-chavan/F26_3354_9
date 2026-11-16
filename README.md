# Emergency Responder Dispatch System

**Team 9, Emergency Responder System** | CE/CS/SE 3354 Software Engineering, Fall 2026

We designed a campus dispatch system to help dispatchers find an available response unit and track an emergency from the first call through closure. Dispatchers use a campus map to mark incidents and assign units. Responders use a separate interface to view assignments and report their progress.

## Dispatch workflow

1. The dispatcher reviews the active units and checks which are available.
2. The dispatcher marks the emergency location on the map, records the incident details, and assigns an available unit.
3. The responder reviews the assignment, marks the unit **On the way**, and updates it to **On scene** upon arrival.
4. The responder marks the response **Completed**. The dispatcher closes the incident, and the unit becomes **Available** for another call.

## Design and implementation status

The design uses a shared server and database to keep the dispatcher and responder views consistent. Both clients read and update the same incident, assignment, and unit-status records.

We completed the requirements and design for the dispatch application. The final report includes a Java example, `makeIncidentReport(Scanner)`, that reads the caller's name, location, and incident description and prints a numbered report. The full dispatch application remains at the design stage.

## Project materials

- [Project scope (PDF)](Project%20Scope.pdf)
- [Deliverable 2 report (PDF)](SE3354_Part_3_Template_Team_Project_Deliverable_2.pdf) covers the requirements, use cases, architecture, project estimates, and test plan.
- [EMS dispatch presentation (PowerPoint)](Team_9_SE3354_F26_EMS_Dispatch_Presentation.pptx)
