A company in the oil extraction business wants to create a new digital system.
The first requirement is about management of the actual oil extractors. All extractors have a serial number,
 an intended capacity (how much they are capable of extracting in 24 hours)
 and a quantity (how much they actually extracted in 24 hours). Additionally, some extractors can report if they had any faults in the last 24 hours.
There are multiple types of extractors:
- Fixed terrestrial extractors are installed in a location that cannot change after it has been initially set. They cannot report faults.
- Mobile terrestrial extractors can change the location after it is set. They report a fault if the daily extracted quantity is below 25% of the capacity.
- Offshore platforms are installed at sea (they have no location) and have a list of essential workers.
    A worker has a name, a position (manual worker, medic or manager), and the number of days they have been on the platform.
    All platforms report a fault if they extracted less than 70% of the intented capacity,
     don't have a medic, or any of the workers has been on board for more than 14 days.

The business is interested a couple of important reports:
- What is the number of devices with faults?
- What are all the devices that have extracted more than 95% of their capacity in the last 24 hours?