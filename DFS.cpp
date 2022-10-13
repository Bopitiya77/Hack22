#include <iostream>
#include <stack>
#include <vector>
using namespace std;

struct Edge
{
    int src, dest;
};

class Graph
{
public:
    vector<vector<int>> adjList;

    Graph(vector<Edge> const &edges, int n)
    {
        adjList.resize(n);

        for (auto &edge : edges)
        {
            adjList[edge.src].push_back(edge.dest);
            adjList[edge.dest].push_back(edge.src);
        }
    }
};

void DFS1(Graph const &graph, int v, vector<bool> &visited)
{
    stack<int> stack;

    stack.push(v);

    while (!stack.empty())
    {
        int u = stack.top();
        stack.pop();

        if (!visited[u])
        {
            visited[u] = true;
            cout << u << " ";

            for (auto i = graph.adjList[u].rbegin(); i != graph.adjList[u].rend(); i++)
            {
                int w = *i;
                if (!visited[w])
                {
                    stack.push(w);
                }
            }
        }
    }
}

void DFS2(Graph const &graph, int v, vector<bool> &visited)
{
    stack<int> stack;
    visited[v] = true;
    stack.push(v);

    while (!stack.empty())
    {
        int u = stack.top();
        stack.pop();
        cout << u << " ";
        for (auto i = graph.adjList[u].rbegin(); i != graph.adjList[u].rend(); i++)
        {
            int w = *i;
            if (!visited[w])
            {
                stack.push(u);
                visited[w] = true;
                stack.push(w);
                break;
            }
        }
    }
}

int main()
{
    int n, sel, noEdges;
    vector<Edge> edges;
    cout << "\nEnter No of nodes you want to create in a graph. : ";
    cin >> n;

    cout << "\nEnter No of edges you want to add. : ";
    cin >> noEdges;
    cout << "\nPlease note that indexing start from '0', So if we have 4 vetices,"
         << "it indicates that it has nodes like this"
         << " 0,1,2,3\n";

    cout << "\n***Add edges here.***";
    for (int i = 0; i < noEdges; i++)
    {
        int dst, src;
        cout << "\nEnter src : ";
        cin >> src;
        cout << "\nEnter dst : ";
        cin >> dst;
        Edge edge;
        edge.dest = dst;
        edge.src = src;
        edges.push_back(edge);
    }

    Graph graph(edges, n);

    vector<bool> visited(n, false);
    cout << "\nPress 1 for DFS1 approach and Press 2 for DFS2 approach: \n";
    cin >> sel;
    if (sel == 1)
    {
        int st;
        cout << "\nYou have selected BFS1.\n";
        cout << "\nPlease enter starting node.\n";
        cin >> st;
        DFS1(graph, st, visited);
    }
    else
    {
        int st;
        cout << "\nYou have selected BFS2.\n";
        cout << "\nPlease enter starting node.\n";
        cin >> st;
        DFS2(graph, st, visited);
    }

    return 0;
}