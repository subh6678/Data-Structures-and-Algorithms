djikstraAlgorithm(startNode) {
    let distances = {};
 
    // Stores the reference to previous nodes
    let prev = {};
    let pq = new PriorityQueue(this.nodes.length * this.nodes.length);
 
    // Set distances to all nodes to be infinite except startNode
    distances[startNode] = 0;
    pq.enqueue(startNode, 0);
    this.nodes.forEach(node => {
       if (node !== startNode) distances[node] = Infinity;
       prev[node] = null;
    });
 
    while (!pq.isEmpty()) {
       let minNode = pq.dequeue();
       let currNode = minNode.data;
       let weight = minNode.priority;
       this.edges[currNode].forEach(neighbor => {
          let alt = distances[currNode] + neighbor.weight;
          if (alt < distances[neighbor.node]) {
             distances[neighbor.node] = alt;
             prev[neighbor.node] = currNode;
             pq.enqueue(neighbor.node, distances[neighbor.node]);
          }
       });
    }
    return distances;
 }

 //Source - https://www.tutorialspoint.com/Dijkstra-s-algorithm-in-Javascript#:~:text=Create%20a%20distance%20collection%20and,the%20minimum%20distance%20from%20it.